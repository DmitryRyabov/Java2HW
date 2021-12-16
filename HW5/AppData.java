package HW5;

import java.io.Serializable;

public class AppData implements Serializable {

    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;


    }

}
