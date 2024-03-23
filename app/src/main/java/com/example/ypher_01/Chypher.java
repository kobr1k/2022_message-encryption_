package com.example.ypher_01;

import android.widget.EditText;

import java.util.Locale;

public class Chypher {
    private String alpgabet ="Й1ЦУ$2К4%ЕН5+ГШЩЗХЪ#ФЫВ@А/3ПР<ОЛ^ДЖЭЯ6Ч&СМ-ИТЬБЮ8_QWERTYUI*9OPAS>DFG!H'0JK:LZX=CVBNM";


    public String zaschifr(String text , String klitsch){

                int klitschindex = 0;
                int zdvich = 0;
                String dano = text.toUpperCase(Locale.ROOT);// вводимый текст будет в верхнем регистре прИвЕт = ПРИВЕТ


                char[] result = new char[dano.length()]; //  создаем(выделяем память) массива чаров который мы будем выводить длину. в наш вводимый текст
                int k; //создаем переменную к
                for (int i = 0; i < dano.length(); i++) { // идем по вводимому тексту по каждой букве
                    k = alpgabet.indexOf(dano.charAt(i));   //HELLO перееменной к присваиваем инддекс позиции буквы в тексте
                    if (k == -1) { // если в аловите небыло найденно буквы которае есть в тексте по дефолту значение ставиться -1
                        result[i] = dano.charAt(i);// то тогда в выводящем массиве на пощиции значение передастся какое есть в вводимом массиве
                    } else { //иначе
                        zdvich = klitsch.charAt(klitschindex); //иначе сдвих будет равняться инедексу нашего ключа (привет)
                        klitschindex++; //идем по тексту                                                          //123456
                        klitschindex = klitschindex % klitsch.length();// фишка при выходе за предел масива начинать с начала
                        k += zdvich;
                        k = k % alpgabet.length();//фишка при выходе за предел масива начинать с начала
                        result[i] = alpgabet.charAt(k);// вывод = получение чара на позиции к
                    }
                }


                return new String(result);





    }
    public String Dechypher(String text , String klitsch){
        String dano = text.toUpperCase(Locale.ROOT);
        char[] result = new  char[dano.length()];
        int k;
        int zdvich = 0;
        int klitschindex = 0;
        for (int i = 0; i <dano.length(); i++) {
            k = alpgabet.indexOf(dano.charAt(i));
            if (k == -1){

                result[i] = dano.charAt(i);
            }
            else{
                zdvich = klitsch.charAt(klitschindex);
                klitschindex++;
                klitschindex = klitschindex% klitsch.length();
                k-= zdvich;
                while (k<0){
                    k = k + alpgabet.length();
                }
                k = k% alpgabet.length();
                result[i] = alpgabet.charAt(k);
            }



        }

            return new String(result);



    }

}
