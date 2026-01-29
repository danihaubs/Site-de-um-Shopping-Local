public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        boolean isDataValida = true;

        if (dia <= 0 || mes <= 0 || ano <= 0 || dia > 31 || mes > 12) {
            isDataValida = false;
        } else {
            if (mes == 2) {
                if (isAnoBissexto(ano) == true){
                    if (dia > 29){
                        isDataValida = false;
                    }
                } else {
                    if (dia > 28){
                        isDataValida = false;
                    }
                }
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if (dia > 30){
                        isDataValida = false;
                    }
                } else {
                    if (dia > 31){
                        isDataValida = false;
                    }
                }
            }
            if (isDataValida == true){
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else {
                System.out.println("Data Inválida");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }
        }
        
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isAnoBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean verificaAnoBissexto() {
        return isAnoBissexto(this.ano);
    }
}