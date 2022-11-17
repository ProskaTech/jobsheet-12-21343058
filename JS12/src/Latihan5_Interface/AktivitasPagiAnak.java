//created by 21343058_Muhammad Farel Fahlevi

package Latihan5_Interface;

public class AktivitasPagiAnak implements AktivitasPagi {
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
