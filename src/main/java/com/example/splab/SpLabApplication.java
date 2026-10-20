package com.example.splab;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) throws Exception {
        Book myBook = new Book("My Book");

        Section cap1 = new Section("Capitolul 1");
        cap1.add(new Paragraph("Intro 1")); // Pagina 1
        cap1.add(new Paragraph("Intro 2")); // Pagina 2

        Section subCap1 = new Section("Subcapitolul 1.1");
        subCap1.add(new Paragraph("Text subcapitol")); // Pagina 3
        subCap1.add(new ImageProxy("Diagrama"));       // Pagina 4
        cap1.add(subCap1);

        Section cap2 = new Section("Capitolul 2");
        cap2.add(new Table("Tabel Date"));             // Pagina 5

        myBook.addContent(cap1);
        myBook.addContent(cap2);

        GenerateToC tocVisitor = new GenerateToC();
        myBook.accept(tocVisitor);

        TableOfContents toc = tocVisitor.getToC();
        toc.print();
    }
}