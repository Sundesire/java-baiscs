package org.itmo.java.lesson6.extra;

import org.itmo.java.lesson6.extra.dao.Document;
import org.itmo.java.lesson6.extra.service.Service;
import org.itmo.java.lesson6.extra.service.impl.ServiceImpl;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        System.out.println(service.create(10, "pdf", false));
        System.out.println(service.create(15, "docx", true));
        System.out.println(service.read(1L));

        Document document = new Document(255, "book", false);
        document.setId(2L);
        System.out.println(service.update(document));

        service.delete(1L);
        service.delete(999L);

        System.out.println("\n [All documents] \n");
        for (Document doc : service.getDocuments()) {
            System.out.println(doc);
        }
    }
}
