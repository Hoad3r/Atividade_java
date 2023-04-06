public class Perfomance extends Rolar_dados{
    void ataque(float attack,int dado){
        // se o ataque for maior que 50% do numero rolado ou seja d20 = 10
        if(attack/dado<=0.05){
            System.out.println("Seu ataque falhou miseravelmente e você perdeu o turno imediatamente em desvantagem");
        }
        else if(attack/dado>=0.1 && attack/dado<0.3){
            System.out.println("O ataque foi mal sucedido");
        }
        else if(attack/dado>=0.3 && attack/dado<0.5){
            System.out.println("O ataque pode ter danificado a armadura, checar defesa");
        }
        else if(attack/dado>=0.5 && attack/dado<0.7){
            System.out.println("O ataque danificou a armadura e causou ferimentos leves");
        }
        else if(attack/dado>=0.7 && attack/dado<0.85){
            System.out.println("O ataque perfurou a armadura e causou um ferimento medio");
        }
        else if(attack/dado>=0.85 && attack/dado<1){
            System.out.println("O ataque perfurou a armadura e afetou um ponto vital o oponente está em desvantagem");
        }
        // fazer função para checar defesa e comparar e exibir
        else if(attack/dado==1){
            System.out.println("Você sente a mudança no fluxo de tempo e tem o tempo de reação aprimorado! desfira o ataque");
        }
    }
    void defesa(float defence,int dado){
        if(defence/dado<=0.05){
            System.out.println("O impacto foi muito grande e você está em desvantagem");
        }
        else if(defence/dado>=0.1 && defence/dado<0.3){
            System.out.println("O ataque foi mal sucedido");
        }
        else if(defence/dado>=0.3 && defence/dado<0.5){
            System.out.println("O ataque pode ter danificado a armadura, checar defesa");
        }
        else if(defence/dado>=0.5 && defence/dado<0.7){
            System.out.println("O ataque danificou a armadura e causou ferimentos leves");
        }
        else if(defence/dado>=0.7 && defence/dado<0.85){
            System.out.println("O ataque perfurou a armadura e causou um ferimento medio");
        }
        else if(defence/dado>=0.85 && defence/dado<1){
            System.out.println("O ataque perfurou a armadura e afetou um ponto vital o oponente está em desvantagem");
        }
        // fazer função para checar defesa e comparar e exibir
        else if(defence/dado==1){
            System.out.println("Você sente a mudança no fluxo de tempo e tem o tempo de reação aprimorado! desfira o ataque");
        }
    }
}
