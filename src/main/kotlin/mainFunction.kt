import java.util.*
import kotlin.math.ceil

/**
 * Nama  : Zulfiana Aulia Syafa
 * Kelas : XI RPL 1
 * Absen : 34
 **/

fun main(){

    //menerapkan scanner
    val inputUser = Scanner(System.`in`)

    //initialize class
    val tabung = Tabung()
    val kerucut = Kerucut()
    print("Nama : ")
    inputUser.nextLine()

    print("Kelas : ")
    inputUser.nextLine()

    print("No Absen : ")
    inputUser.nextInt()
    println("===========================")
    println("Kamu Ingin Menghitung apa?")
    println("1. Volume Kerucut")
    println("2. Volume Tabung")
    print("Silahkan pilih : ")
    when {
        inputUser.nextInt() == 1 -> {

            //menghitung volume kerucut
            print("Masukkan tinggi : ")
            kerucut.tinggi = inputUser.nextFloat()
            print("Masukkan jari-jari : ")
            kerucut.jariJari = inputUser.nextFloat()
            println("Berapa volume kerucut tersebut?")
            println("Diketahui : \n Jari-jari ${kerucut.jariJari} \n Tinggi ${kerucut.tinggi}")


            //hasil volume
            val vKerucut = volumeKerucut(kerucut.jariJari!!, kerucut.tinggi!!)
            //membulatkan 2 angka dibelakang koma
            val volumeBulatkan = ceil(vKerucut)
            println("Jawab : \n Rumus kerucut adalah ( (1/3) * (22/7) * r * r * tinggi )\n Jadi volume kerucut adalah "
                    + String.format("%.2f", vKerucut ))


        }
        inputUser.nextInt()==2 -> {

            //hitung volume
            print("Masukkan tinggi : ")
            tabung.tinggi = inputUser.nextFloat()
            print("Masukkan jari-jari : ")
            tabung.jariJari = inputUser.nextFloat()
            println("Berapa volume tabung tersebut?")
            println("Diketahui : \n Jari-jari ${tabung.jariJari} \n Tinggi ${tabung.tinggi}")

            //hasil volume
            val vTabung = volumeTabung(tabung.jariJari!!, tabung.tinggi!!)
            //membulatkan 2 angka dibelakang koma
            val volumeBulatkan = ceil(vTabung)
            println("Jawab : \n Rumus tabung adalah ( (22/7) * r * r * tinggi )\n Jadi volume tabung adalah "
                    + String.format("%.2f", vTabung ))

        }
        else -> {
            println("Menu tidak tersedia")
        }
    }

}

fun volumeKerucut(r : Float, t : Float) : Double{
    return (Math.PI * r * r) * t / 3
}
fun volumeTabung(r : Float, t : Float) : Double {
    return (Math.PI * r * r) * t
}