void main(){

    IO.println("\033[H\033[2J"); // limpar tela
    String nome = IO.readln("Nos informe o seu nome  completo: ");
    char genero = IO.readln("Qual seu gênero? M - masculino F - feminino N - prefiro não dizer: ").charAt(0);
    String alturaString = IO.readln("Qual sua altura em metros? ");
    double altura = Double.valueOf (alturaString);
    String pesoString = IO.readln("Qual seu peso em Kilos? ");
    double peso = Double.valueOf (pesoString);

    double imc = (peso /  (Math.pow(altura, 2)));
    System.out.printf ("Seu imc é de: %.2f ", imc);
    IO.println("Classificado como:");

    
    switch (genero) {
        case 'M', 'm':
            if (imc < 20)
                IO.println("Abaixo do normal");
        
            else if(imc >= 20 && imc <= 24.9)
                IO.println("Normal");

            else if(imc >= 25 && imc <= 29.9)
                IO.println("Obesidade Leve");

            else if(imc >= 30 && imc <= 39.9)
                IO.println("Obesidade Moderada");

            else if(imc >= 40)
                IO.println("Obesidade Mórbida");

            break;
        case 'F', 'f', 'N', 'n':
            if (imc < 19)
                IO.println("Abaixo do normal");
        
            else if(imc >= 19 && imc <= 23.9)
                IO.println("Normal");

            else if(imc >= 24 && imc <= 28.9)
                IO.println("Obesidade Leve");

            else if(imc >= 29 && imc <= 38.9)
                IO.println("Obesidade Moderada");

            else if(imc >= 39)
                IO.println("Obesidade Mórbida");

            break;
        default:
            IO.println("Gênero inválido.");
            break;
    }

}
