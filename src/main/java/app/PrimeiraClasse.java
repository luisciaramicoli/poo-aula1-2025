package app;

public class PrimeiraClasse {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Luis";
        a1.idade = 18;

        Aluno a2 = a1;
        a2.nome = "Jose";
        System.out.println("[ A1 ]");
        System.out.println("Nome = "+ a1.nome);
        System.out.println("Idade = "+ a1.idade);

        System.out.println("[ A2 ]");
        System.out.println("Nome = "+ a2.nome);
        System.out.println("Idade = "+ a2.idade);

        System.out.println("[ CHAMADA DE MÉTODO ]");
        System.out.println("A1 = "+ a1.getDados());
        System.out.println("A2 = "+ a2.getDados());
        
        Aluno a3 = new Aluno("Maria",35);
        System.out.println("[ CHAMADA DE MÉTODO ]");
        System.out.println("A3 = "+ a3.getDados());

        Cliente c1 = new Cliente();
         c1.setNome("Joao");
        System.out.println("[ CHAMADA DE MÉTODO Privado ]");
        System.out.println(c1.getNome());
    }
}