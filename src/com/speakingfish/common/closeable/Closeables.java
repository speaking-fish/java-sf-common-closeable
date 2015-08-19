package com.speakingfish.common.closeable;

/**
 * @since 1.7
 */
public class Closeables {

    public boolean canClose(Object value) {
        if(value instanceof AutoCloseable) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void catchClose(AutoCloseable value) {
        try {
            value.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static boolean tryClose(Object value) throws Exception {
        if(value instanceof AutoCloseable) {
            ((AutoCloseable) value).close();
            return true;
        } else {
            return false;
        }
    }

    public static boolean tryCatchClose(Object value) {
        if(value instanceof AutoCloseable) {
            try {
                ((AutoCloseable) value).close();
            } catch(Exception e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }
}
