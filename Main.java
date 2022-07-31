public class Main {

    public static void main(String[] args) {

        CompanyManagement companyManager = new CompanyManagement();

        companyManager.addPermanentEmployee("Ali", "Aliyev", 1000d, "Aparatchi", "1a");
        companyManager.addPermanentEmployee("Vali", "Valiyev", 700d, "Choychi", "1d");
        companyManager.addSeasonalEmployee("Axmad", "Axmadov", 400d, "Work1", "Autumn");
        companyManager.addSeasonalEmployee("Toshmad", "Toshmatov", 500d, "Work1", "Autumn");
        companyManager.addTemporaryEmployee("Eshmad", "Eshmatov", 100d, "Work1", 5);
        companyManager.addPartnerEmployee("Firdavs", "Amonov", 2300d, "Backend Developer");

    }
}
