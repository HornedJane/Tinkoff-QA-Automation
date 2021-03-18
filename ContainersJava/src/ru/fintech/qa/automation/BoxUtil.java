package ru.fintech.qa.automation;

public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T element = src.get();
        if (element != null) {
            dest.put(element);
            System.out.println(element.getClass().getName() + " copied to destination box");
        } else {
            System.out.println("Source box is empty");
        }

    }

    public static void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        if (src.get() == null) {
            System.out.println("Source box is empty");
            return;
        }
        if (src.get().getFresh()) {
            dest.put(src.get());
            System.out.println("Fresh " + src.get().getClass().getName() + " copied to destination box");
        } else {
            System.out.println("Source box don't contains fresh fruits");
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        System.out.println(box.get().get().toString());
    }

    public static void printElementFromBoxes(final Box<?> box) {
        if (box.get().getClass().getName().contains("Box")) {
            printElementFromBoxes((Box<?>) box.get());
        } else {
            System.out.println(box.get().toString());
        }
    }

}


