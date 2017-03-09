package com.sdajava.Queue;

public class QueueImpl {    // jeden element z kolejki plus strzalka

    private String value;
    private QueueImpl next;

    public QueueImpl(String value){
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueImpl getNext() {
        return next;
    }

    public void setNext(QueueImpl next) {
        this.next = next;
    }
}
