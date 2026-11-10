package com.example.splab.controllers;

import com.example.splab.observer.AllBooksSubject;
import com.example.splab.observer.SseObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/books-sse")
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    @Autowired
    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L); // 0L inseamna timeout infinit
        SseObserver observer = new SseObserver(emitter);
        allBooksSubject.attach(observer);

        emitter.onCompletion(() -> allBooksSubject.detach(observer));
        emitter.onTimeout(() -> allBooksSubject.detach(observer));
        emitter.onError((e) -> allBooksSubject.detach(observer));

        return emitter;
    }
}