package mbti;

import java.util.Objects;

public class kategori3 extends data{
    private String pil,pilT;

    @Override
    public void setPil(String pil) {
        this.pil = pil;
    }

    @Override
    public String getPil() {
        if(Objects.equals(pil, "1")){
            pilT = "T";
        }else if(Objects.equals(pil, "2")){
            pilT = "F";
        }
        return pilT;
    }
}
