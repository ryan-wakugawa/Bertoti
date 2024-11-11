class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Filial A", 50000, 20000);
        Empresa empresa2 = new Empresa("Filial B", 70000, 25000);
        Empresa empresa3 = new Empresa("Filial C", 30000, 10000);
        Empresa empresa4 = new Empresa("Filial D", 20000, 5000);

        EmpresaMae empresaMae = new EmpresaMae("Empresa Mãe");
        empresaMae.adicionarFilial(empresa1);
        empresaMae.adicionarFilial(empresa2);

        EmpresaMae subEmpresa = new EmpresaMae("SubEmpresa");
        subEmpresa.adicionarFilial(empresa3);
        empresaMae.adicionarFilial(subEmpresa);

        System.out.println("Lucro total da Empresa Mãe: " + empresaMae.calcularLucro());
        System.out.println("Gastos totais da Empresa Mãe: " + empresaMae.calcularGastos());
    }
}
