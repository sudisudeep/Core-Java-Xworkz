class AgroIndustryTester {
    public static void main(String[] args) {
        AgroIndustry agroIndustry1 = new AgroIndustry();
        agroIndustry1.name = "Farm Fresh Foods";
        agroIndustry1.location = "New York";
        agroIndustry1.employees = 50;
        
        System.out.println("Agro-Industry 1 Details:");
        System.out.println("Name: " + agroIndustry1.name);
        System.out.println("Location: " + agroIndustry1.location);
        System.out.println("Number of Employees: " + agroIndustry1.employees);
        System.out.println();
        
        AgroIndustry agroIndustry2 = new AgroIndustry();
        agroIndustry2.name = "Green Fields Agro";
        agroIndustry2.location = "California";
        agroIndustry2.employees = 30;
        
        System.out.println("Agro-Industry 2 Details:");
        System.out.println("Name: " + agroIndustry2.name);
        System.out.println("Location: " + agroIndustry2.location);
        System.out.println("Number of Employees: " + agroIndustry2.employees);
        System.out.println();
    }
}