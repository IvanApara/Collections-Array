package practice.hospital;


import java.text.DecimalFormat;


public class Hospital {


    public static float[] generatePatientsTemperatures(int patientsCount) {
        float min = 32.0F;
        float max = 40.0F;
        float[] temperature = new float[patientsCount];
        DecimalFormat decimalFormat = new DecimalFormat("#.0");

        for (int i = 0; i < temperature.length; i++) {
            double x = (float)(Math.random()*((max-min)+1))+min;
            String f = decimalFormat.format(x);
            String d = f.replace(",", ".");
            double ch = Double.parseDouble(d);
            temperature[i] = (float) ch;
            if (temperature[i] <= min || temperature[i] >= max){
                temperature[i] = 36.1F;
            }
        }
        return temperature;

    }

    public static String getReport(float[] temperatureData) {

        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */


        String temperaturs = "";
        float value = 0;
        int healthy = 0;
        for (int i = 0; i <= temperatureData.length - 1; i++){
            float b = temperatureData[i];
            if(i == temperatureData.length - 1){
                temperaturs += b ;
                value = (value + b) / temperatureData.length;
                value = (float) Math.round(value*100)/100;
                break;
            }
            temperaturs += b + " ";
            value += b;

            if(b >= 36.2 && b < 37.0 ){
                 healthy++;
            }

        }


        String report =
            "Температуры пациентов: " + temperaturs +
            "\nСредняя температура: " + value +
            "\nКоличество здоровых: " + healthy;

        return report;
    }
}
