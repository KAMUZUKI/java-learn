package com.mu.tree;

public class OrderArray {
    private long[] a;
    private int nElems;

    public OrderArray(int max) {
        a = new long[max];
        nElems = 0;
    }
    public int size() {
        return nElems;
    }

    public int find(long key) {
        int lowBound = 0;
        int highBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowBound + highBound) / 2;
            if(a[curIn] == key) {
                return curIn;
            } else if (lowBound > highBound) {
                return nElems;
            } else {
                if(a[curIn] < key) {
                    lowBound = curIn + 1;
                } else {
                    highBound = curIn -1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for(j = 0; j < nElems; j ++) {
            if(a[j] > value) {
                break;
            }
        }

        for(int k = nElems; k > j; k --) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElems ++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if(j == nElems) {
            return false;
        } else {
            for(int k = j; k < nElems - 1; k ++) {
                a[k] = a[k + 1];
            }
            nElems --;
            return true;
        }

    }

    public void disPlay() {
        for(int j = 0; j < nElems; j ++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
