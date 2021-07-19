package ru.job4j.lambda;

import java.util.*;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 4", 34),
                new Attachment("image 3", 13),
                new Attachment("image 2", 70)
        );
        Comparator<Attachment> comparator1 = (left, right) -> left.getSize() - right.getSize();
        attachments.sort(comparator1);
        System.out.println(attachments);
        Comparator<Attachment> comparator2 =  (left, right) ->
                left.getName().compareTo(right.getName());
        attachments.sort(comparator2);
        System.out.println(attachments);
        Comparator<Attachment> cmpDescSize = (left, right) ->
                Integer.compare(right.getSize(), left.getSize());
    }
}
