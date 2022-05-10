package mbti;

import javax.swing.*;

public class data implements itf_data{
    private String name,jk;
    private int umur;
    private String pil;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getJk() {
        return jk;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setPil(String pil) {
        this.pil = pil;
    }

    public String getPil() {
        return pil;
    }

    protected void tampil(String s) {
    }

}


