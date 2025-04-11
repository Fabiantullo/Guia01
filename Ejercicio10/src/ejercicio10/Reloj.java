package ejercicio10;

public class Reloj {

    private byte hora;
    private byte minuto;
    private byte segundo;

    public Reloj(byte hora, byte minuto, byte segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(byte hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("La cantidad de horas ingresada es incorrecta");
        }
    }

    public void setMinuto(byte minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("La cantidad de minutos ingresados es incorrecta");
        }
    }

    public void setSegundo(byte segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("La cantidad de segundos ingresados es incorrecta");
        }
    }

    public void avanzarTiempo() {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            this.minuto++;
            if (this.minuto == 60) {
                this.minuto = 0;
                this.hora++;
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }

    public void getTiempoActual() {
        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
    }
}