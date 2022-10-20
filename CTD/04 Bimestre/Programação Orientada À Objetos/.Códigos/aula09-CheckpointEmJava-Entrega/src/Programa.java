import entities.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Programa {

    public static void main(String[] args) {

        Calendar HOJE = new GregorianCalendar(2022, Calendar.JUNE, 5);
        Calendar dataNascimentoA1 = new GregorianCalendar(1986, Calendar.SEPTEMBER, 10);
        Calendar dataNascimentoA2 = new GregorianCalendar(1985, Calendar.OCTOBER, 15);
        Calendar dataNascimentoA3 = new GregorianCalendar(1946, Calendar.JULY, 6);
        // 3 instancias de Aluno
        Aluno a1 = new Aluno(2, "Diego","Reis", 'M', dataNascimentoA1, "98765432100", 8888, HOJE);
        Aluno a2 = new Aluno(3, "Ualace","Santos", 'M', dataNascimentoA2, "65498711133", 9999, HOJE);
        Aluno a3 = new Aluno(4, "Rocky","Balboa", 'M', dataNascimentoA3, "32132165498", 6666, HOJE);
        Aluno[] alunos = {a1,a2,a3};
        Aluno[] alunos2 = {};
        Aluno[] alunos3 = {};

        // 3 instancias de Disciplina
        Disciplina d1 = new Disciplina(1, "Portugues", 40);
        Disciplina d2 = new Disciplina(2, "Matematica", 45);
        Disciplina d3 = new Disciplina(3, "Redacao", 35);
        Disciplina[] disciplinas = {d1,d2,d3};

        // 3 instancias de Serie
        Serie serie = new Serie(10, "5 serie - noturno", disciplinas);
        Serie serie2 = new Serie(11, "6 serie - vespertino", disciplinas);
        Serie serie3 = new Serie(12, "5 serie - matutino", disciplinas);

        // 3 instancias de Turma
        Turma T08Noturno = new Turma(821, "T08-CTD Part Time", "Virtual", 20, alunos, serie);
        Turma T09Noturno = new Turma(822, "T09-CTD Part Time", "Virtual", 20, alunos2, serie2);
        Turma T10MatVesp = new Turma(823, "T10-CTD Full Time", "Virtual", 40, alunos3, serie3);
        Turma[] turmasEnsinando = {T08Noturno};
        Turma[] turmasVazias = {};


        Calendar dataNascimento = new GregorianCalendar(1960, Calendar.JANUARY, 1);
        Calendar dataAdmissao = new GregorianCalendar(2015, Calendar.SEPTEMBER, 11);

        Calendar dataNascimentoMises = new GregorianCalendar(1881, Calendar.SEPTEMBER, 29);
        Calendar dataAdmissaoMises = new GregorianCalendar(1950, Calendar.SEPTEMBER, 11);

        Calendar dataNascimentoGeorge = new GregorianCalendar(1903, Calendar.JUNE, 25);
        Calendar dataAdmissaoGeorge = new GregorianCalendar(1930, Calendar.SEPTEMBER, 11);

        // 3 instancias de professor
        Professor prof1 = new Professor(1, "Marcelo", "Souza", 'M', dataNascimento, "01234567899", 1234, dataAdmissao, 5600.00, true, true, turmasEnsinando);
        Professor prof2 = new Professor(2, "Ludwig", "Von Mises", 'M', dataNascimentoMises, "00000000001", 1111, dataAdmissaoMises, 40000.00, true, true, turmasVazias);
        Professor prof3 = new Professor(3, "George", "Orwell", 'M', dataNascimentoGeorge, "00000000002", 2222, dataAdmissaoGeorge, 35000.00, true, true, turmasVazias);

        // Testes
        a1.estudar();

        prof1.ensinarTurma(turmasEnsinando[0].getNome());
        
    }


}
