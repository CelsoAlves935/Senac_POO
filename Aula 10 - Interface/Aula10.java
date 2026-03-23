public class Aula10 {
    public static void main(String args[]){

        //Rascunho
        //--------------
        Moto minhaMoto = new Moto( "Yamaha", 2025 );
        minhaMoto.acelera();
        minhaMoto.anda();
        minhaMoto.freia();
        minhaMoto.daGrau();
        //-------------------------

        System.out.println("---------------\n");

        RH rh = new RH();
        SistemaDeEnsino se = new SistemaDeEnsino();
        Portaria portaria = new Portaria();
        Oficina oficina = new Oficina();

        Visitante v1 = new Visitante("Marcela", 1111 );
        Visitante v2 = new Visitante("Pedro", 1112 );
        Visitante v3 = new Visitante("Joana", 1113 );
        Professor p1 = new Professor( "Ludovica" , 2111, 500);
        Professor p2 = new Professor( "Marcos" , 2112, 50000);
        Professor p3 = new Professor( "Carlos", 2113, 1000);
        Aluno a1 = new Aluno("Maria", 3111);
        Aluno a2 = new Aluno("João", 3112);
        Aluno a3 = new Aluno("Enzo", 3113);
        ProfessorMecanica pm1 = new ProfessorMecanica("Roberto", 4111, 40000);
        ProfessorMecanica pm2 = new ProfessorMecanica("Marcia", 4112, 50000);
        AlunoMecanica am1 = new AlunoMecanica("Joana", 5111);
        AlunoMecanica am2 = new AlunoMecanica("Pedro", 5112);

        //--Portaria
        portaria.adicionaPessoa(v1);
        portaria.adicionaPessoa(v2);
        portaria.adicionaPessoa(v3);
        portaria.adicionaPessoa(p1);
        portaria.adicionaPessoa(p2);
        portaria.adicionaPessoa(p3);
        portaria.adicionaPessoa(a1);
        portaria.adicionaPessoa(a2);
        portaria.adicionaPessoa(a3);
        portaria.adicionaPessoa(pm1);
        portaria.adicionaPessoa(pm2);
        portaria.adicionaPessoa(am1);
        portaria.adicionaPessoa(am2);

        portaria.liberaAcesso(2113);

        //--RH
        rh.adicionaProfessor(p1);
        rh.adicionaProfessor(p2);
        rh.adicionaProfessor(p3);
        rh.adicionaProfessor(pm1);
        rh.adicionaProfessor(pm2);
        rh.folhaDePagamento();

        //--Sistema de ensino
        se.adicionaAluno(a1);
        se.adicionaAluno(a2);
        se.adicionaAluno(a3);
        se.adicionaAluno(am1);
        se.adicionaAluno(am2);
        se.fazAvaliacao( 3111 , 10.0);
        se.fazAvaliacao( 3112 , 8.0);
        se.fazAvaliacao( 3113 , 9.0);
        se.fazAvaliacao( 5111 , 9.0);
        se.fazAvaliacao( 5112 , 9.0);

        //--Oficina
        oficina.adicionaMecanico(pm1);
        oficina.adicionaMecanico(pm2);
        oficina.adicionaMecanico(am1);
        oficina.adicionaMecanico(am2);
        oficina.liberaAcesso(4111);
        oficina.liberaAcesso(4112);
        oficina.liberaAcesso(5111);
        oficina.liberaAcesso(5112);








    }
}