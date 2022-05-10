package mbti;
import javax.swing.*;

public class main extends data{
    public static void main(String[] args) {
        main ob = new main();
        kategori1 kt1 = new kategori1();
        kategori2 kt2 = new kategori2();
        kategori3 kt3 = new kategori3();
        kategori4 kt4 = new kategori4();
        String name,jk,pil = null,kategori1,kategori2,kategori3,kategori4;
        String hasil = null;
        int umur;

//        System.out.println("=================================================");
//        System.out.println("=    SELAMAT DATANG DI PROGRAM MBTI SEDERHANA   =");
//        System.out.println("=================================================");

        name = JOptionPane.showInputDialog("Masukkan nama Anda : ");
        ob.setName(name);
        ob.tampil("Nama             : " +ob.getName());

        jk = JOptionPane.showInputDialog("Jenis Kelamin : ");
        ob.setJk(jk);
        ob.tampil("Jenis Kelamin    : " +ob.getJk());

        umur = Integer.parseInt(JOptionPane.showInputDialog("Umur Anda : "));
        ob.setUmur(umur);
        ob.tampil("Umur             : " +ob.getUmur());

        System.out.println("=================================================");

        kategori1 = JOptionPane.showInputDialog("Saya itu   : \n"
                + "1.   Berbicara dengan mudah dan panjang pada orang asing \n"
                + "2.   Berbicara sedikit pada orang asing");
        kt1.setPil(kategori1);
        kt1.getPil();

        kategori2 = JOptionPane.showInputDialog("Saya lebih percaya pada   : \n"
                + "1.   Pengalaman \n"
                + "2.   Firasat");
        kt2.setPil(kategori2);
        kt2.getPil();

        kategori3 = JOptionPane.showInputDialog("Situasi yang membuat saya lebih tertarik adalah yan2g lebih   : \n"
                + "1.   Terstruktur dan terjadwal \n"
                + "2.   Tidak terstruktur dan tidak terjadwal");
        kt3.setPil(kategori3);
        kt3.getPil();

        kategori4 = JOptionPane.showInputDialog("Saya cenderung   : \n"
                + "1.   Serius dan meyakinkan \n"
                + "2.   Easy-going");
        kt4.setPil(kategori4);
        kt4.getPil();

//      INTROVERT
        if(kt1.getPil() == "I"){
            if(kt2.getPil() == "S"){
                if(kt3.getPil() == "T"){
                    if(kt4.getPil() == "J"){
                        hasil = "ISTJ berkarakter tenang, serius, teliti, tekun, handal, realistis, praktis, dan logis. \nOrientasinya pada tanggung jawab dan fakta, mengedepankan logika saat memutuskan sesuatu. \nIa menyukai pekerjaan dan kehidupan yang tertib dan teratur. \nTak heran bila sosok ini loyal dan memegang teguh tradisi.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "Tipe kepribadian MBTI ini berkarakter toleran dan fleksibel. \nKetenangannya dalam menganalisis membuatnya mampu bertindak cepat menemukan solusi. \nBerminat pada hubungan sebab-akibat, ISTP dapat mengolah fakta secara efisien dan logis.";
                    }

                }else if(kt3.getPil() == "F"){
                    if(kt4.getPil() == "J"){
                        hasil = "ISFJ itu tenang, teliti, bertanggungjawab, berkomitmen, telaten, cermat, baik hati, loyal, dan perhatian. \nSesuatu yang penting akan diingatnya secara spesifik. \nKepribadian MBTI ini menyukai ketertiban di tempat tinggal maupun tempat kerja.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "Kepribadian MBTI ISFP adalah sosok yang tenang, sensitif, dan baik hati. \nMereka membutuhkan ruang sendiri, bekerja sesuai dengan waktunya sendiri, hadir dan menikmati masa kini. \nMereka berkomitmen pada orang atau prinsip yang penting bagi dirinya. Karena tak menyukai perselisihan atau konflik, ISFP takkan memaksakan pendapat atau prinsipnya.";
                    }
                }
            }else if(kt2.getPil() == "N"){
                if(kt3.getPil() == "T"){
                    if(kt4.getPil() == "J"){
                        hasil = "INTJ adalah orang-orang yang dapat dengan cepat memahami pola atas suatu peristiwa yang tengah terjadi, \nkemudian menyusun perspektif dalam jangka panjang. \nMereka mandiri, terorganisir, serta memiliki standar kompetensi dan kinerja yang tinggi untuk diri sendiri dan orang lain.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "Tipe kepribadian MBTI ini lebih tertarik dengan ide ketimbang interaksi sosial. \nMereka adalah orang-orang yang teoretis dan abstrak, dengan tampilan yang cerdas dan tenang. \nJika memiliki minat, mereka mampu fokus mendalami suatu masalah sampai menemukan solusi.";
                    }

                }else if(kt3.getPil() == "F"){
                    if(kt4.getPil() == "J"){
                        hasil = "INFJ adalah si pencari makna. \nIa tertarik untuk memahami pemikiran orang lain, hubungan antar ide, bahkan hubungan sosial. \nPunya komitmen tinggi dalam bekerja, tipe kepribadian MBTI ini ingin melayani orang-orang di sekitarnya sebaik mungkin.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "INFP adalah seseorang yang idealis, teguh memegang prinsip, dan setia terutama pada orang-orang penting dalam hidupnya. \nTipe kepribadian MBTI ini memiliki rasa ingin tahu yang tinggi, terbuka dengan berbagai kemungkinan. \nIa adalah sosok yang fleksibel dan adaptif, kecuali pada prinsip yang dipegangnya.";
                    }
                }

            }
//      EKSTROVERT
        }else if(kt1.getPil() == "E"){
            if(kt2.getPil() == "S"){
                if(kt3.getPil() == "T"){
                    if(kt4.getPil() == "J"){
                        hasil = "ESTJ adalah tipe yang praktis, realistis, berorientasi fakta, dan tegas. \nIa tahu bagaimana mengatur pekerjaan secara efisien agar diperoleh hasil terbaik. \nStandar logika yang dimiliki ESTJ membantunya membuat keputusan dengan cepat, hingga terkadang memaksakan rencananya.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "Kepribadian MBTI ESTP adalah sosok yang fleksibel dan toleran, suka menjalin berkomunikasi aktif. \nBagi ESTP, teori itu membosankan. \nJustru mereka belajar dengan baik saat harus melakukan sesuatu secara langsung.";
                    }

                }else if(kt3.getPil() == "F"){
                    if(kt4.getPil() == "J"){
                        hasil = "ESFJ adalah karakter yang suka bekerja sama dalam lingkungan yang harmonis. \nMereka mampu memahami kebutuhan orang lain berusahan memenuhinya. \nKepribadian MBTI ESFJ ingin dihargai sebagai pribadi dan atas apa yang telah dikerjakannya.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "Tipe kepribadian MBTI ini adalah sosok yang ramah, bersahat, fleksibel, adaptif, spontan, mencintai kehidupannya sendiri dan orang lain. \nIa suka belajar dan bekerja bersama orang lain dengan pendekatan yang logis dan realistis.";
                    }
                }
            }else if(kt2.getPil() == "N"){
                if(kt3.getPil() == "T"){
                    if(kt4.getPil() == "J"){
                        hasil = "Berkat pengetahuannya yang luas, ENTJ adalah pembaca keadaan yang baik. \nIa peka dalam memilah prosedur atau kebijakan yang kurang efisien, bahkan mampu mengembangkan sistem guna mengatasi persoalan dalam organisasi. \nTipe kepribadian MBTI ini tak segan memaksakan idenya.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "Sisi ekstrovert kepribadian MBTI ini menjadikannya sosok yang blak-blakan. \nMereka tak ragu bila harus memecahkan masalah dengan cara-cara yang menantang, namun sekaligus strategis. \nTipe ENTP menyukai kegiatan-kegiatan yang menarik dan mudah merasa jenuh dengan rutinitas.";
                    }

                }else if(kt3.getPil() == "F"){
                    if(kt4.getPil() == "J"){
                        hasil = "ENFJ adalah sosok yang hangat, berempati tinggi, dan pendengar yang baik. \nTipe kepribadian MBTI ini senang bergaul, suka memudahkan urusan dan mendorong orang lain mencapai potensinya. \nIa mampu menerima kritik dan pujian dengan baik.";
                    }else if(kt4.getPil() == "P"){
                        hasil = "ENFP juga berkarakter hangat. Ia adalah sosok yang imajinatif dengan antusiasme tinggi. \nKemampuannya dalam memahami pola dan hubungan suatu informasi dengan kejadian tertentu membuat ENFP percaya diri dalam melakukan sesuatu. \nTipe kepribadian MBTI ini suportif, fleksibel, spontan, dan fasih berbicara.";
                    }
                }

            }
        }




        JOptionPane.showMessageDialog(null,
                "Nama : " + ob.getName() + "\n" +
                        "Umur : " + ob.getUmur() + " Tahun " +"\n" +
                        "Jenis Kelamin : " + ob.getJk() +"\n" +
                        "kepribadian kamu adalah " + kt1.getPil() + kt2.getPil() + kt3.getPil() + kt4.getPil()+ "\n"
                        +"Anaisis : \n" + hasil,
                "input",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
