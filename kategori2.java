package mbti;

import java.util.Objects;

public class kategori2 extends data{
    private String pil,pilT;

    @Override
    public void setPil(String pil) {
        this.pil = pil;
    }

    @Override
    public String getPil() {
        if(Objects.equals(pil, "1")){
            pilT = "S";
        }else if(Objects.equals(pil, "2")){
            pilT = "N";
        }
       return pilT;
    }
}
