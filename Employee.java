public class Employee { // sınıfımızın içerisine nesne ve fonksiyon tanımlamalarını yaptık
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax;
    double raiseSalary;
    double bonus;
    int today = 2021;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        calculateTax(); // fonksiyonlarımızı çalışana nesnemize tanımladık
        calculateBonus();
        calculateRaiseSalary();
    }

    private void calculateTax() {
        if (salary > 1000) {
            this.tax = this.salary * 0.03;
        }
    }

    private void calculateBonus() {
        if (workHours > 40) {
            this.bonus = (workHours - 40) * 30;
        }
    }

    private void calculateRaiseSalary() {
        if (today - hireYear > 19) {
            this.raiseSalary = this.salary * 0.15;
        } else if (today - hireYear < 20 && today - hireYear > 9) {
            this.raiseSalary = this.salary * 0.1;
        } else if (today - hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        }
    }

    public void Bilgiler() {
        System.out.println("Adı  : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Maaş Artışı : " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + ( this.bonus + this.salary - this.tax ));
        System.out.println("Toplam Maaş : " + ( this.bonus + this.raiseSalary + this.salary - this.tax ));
    }
}