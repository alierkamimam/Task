package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Methods {

    /*
     1) Verilen bir string değerinin içerdiği tüm farklı karakterlerin, bu string içerisinde yalnızca
     bir kere bulunup bulunmadığını belirleyen bir algoritma geliştiriniz.
     Örn: isUnique("tree") => false, isUnique("home") => true
     */

    public static boolean datastructureisUnique(String word) {
        try {
            //word = word.toLowerCase(); Case-sensitive kurallarına bakılmayacaksa toLowerCase() methodu kullanarak
            //işlem yapılır

            //Elimizdeki string değeri split() metodu kullanarak herbir harfi array e ekleriz.
            String[] arr = word.split("");

            //Elimizdeki arrayı List ve Set e pass ederiz.
            List<String> wordIntoList = new ArrayList<>(Arrays.asList(arr));
            Set<String> wordIntoSet = new HashSet<>(Arrays.asList(arr));

            //list ve set in size larını kontrol ederiz.Bunun sebebide
            // List dublicate dir . Set non-dublicated dir. Yani Set unique değerler tutar.
            return wordIntoList.size() == wordIntoSet.size();

        } catch (NullPointerException e) {
            //Eğer girilen değer null ise NullPointerException atar.
            throw new NullPointerException("Value should not null");
        }

    }

    /* 2) Geliştirdiğiniz "isUnique" algoritmasını herhangi bir veri yapısı (array, list, map vs.)
     içermeyecek şekilde yeniden geliştiriniz.
     */
    public static boolean isUnique(String word) {
        try {
            //word = word.toLowerCase();Case-sensitive kurallarına bakılmayacaksa toLowerCase() methodu kullanarak
            // işlem yapılır

            //word.length() - 1 kadar karakteri dolaşır.
            for (int i = 0; i < word.length() - 1; i++) {
                //2. karakterden başlayıp son karaktere kadar gider
                for (int j = i + 1; j < word.length(); j++) {
                    //herbir karakter karşılaştırılır eğer aynı karakter varsa false döner
                    if (word.charAt(i) == word.charAt(j)) {
                        return false;
                    }
                }
            }
            //eğer her bir karakter bir kez görülürse true döner.
            return true;
        } catch (NullPointerException e) {
            throw new NullPointerException("Value should not null");
        }

    }

   /* 3)İki pozitif sayıyı toplayan bir fonksiyon yazınız. Fonksiyon içerisinde (+) ya da herhangi bir
    aritmetik operator kulllanmamanız beklenmektedir.

    */
    public static void total(int x, int y) {
        try {
            //Girilen değerlerin pozitif olması durumu check edilir.
            if (x <= 0 && y <= 0) {
                //pozitif değilse IllegalArgumentException atar.
                throw new IllegalArgumentException("The number must be positive.");
            }
            //y' sıfıra eşit olmadığı sürece, aşağıdaki adımları tekrarlar
            while (y != 0) {
                // carry değişkenine x ve y arasındaki "bitwise AND" işlemi uygulanarak taşıma biti alınır
                int carry = x & y;
                // 'x' ve 'y' arasındaki "bitwise XOR" işlemi uygulanarak toplamın "carry" bitsiz değeri bulunur.
                x = x ^ y;
                //'y', "carry" değerini bir sola kaydırarak güncellenir.
                y = carry << 1;
            }
            //y sıfır olduğunda, x toplamının son değeri, System.out.println() fonksiyonu kullanılarak ekrana yazdırılır.
            System.out.println(x);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());


        }

    }


}
