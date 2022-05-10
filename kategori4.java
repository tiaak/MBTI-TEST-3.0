package mbti;

import java.util.Objects;

public class kategori4 extends data{
    private String pil,pilT;

    @Override
    public void setPil(String pil) {
        this.pil = pil;
    }

    @Override
    public String getPil() {
        if(Objects.equals(pil, "1")){
            pilT = "J";
        }else if(Objects.equals(pil, "2")){
            pilT = "P";
        }
        return pilT;
    }
}
