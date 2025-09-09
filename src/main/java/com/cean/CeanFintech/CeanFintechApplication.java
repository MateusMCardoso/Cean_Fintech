package com.cean.CeanFintech;

import com.cean.CeanFintech.enums.ItemStats;
import com.cean.CeanFintech.enums.PaymentMethod;
import com.cean.CeanFintech.enums.Type;
import com.cean.CeanFintech.model.Category;
import com.cean.CeanFintech.model.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class CeanFintechApplication {

    public static void main(String[] args) {

        // Toda execução por enquanto é só um teste.


        Scanner leitor = new Scanner(System.in);

        System.out.println("🔥 === Registro de Demonstração === 🔥");

        System.out.println("Criando uma categoria 'Alimentação' para o teste...");
        Category categoriaAlimentacao = new Category.CategoryBuilder()
                .withId(1L)
                .withName("Alimentação")
                .withType(Type.DESPESA)
                .build();

        System.out.print("Qual o nome da descrição? ");
        String nome = leitor.nextLine();

        System.out.print("Qual o custo em Reais (ex: 50.75)? ");
        BigDecimal valor = new BigDecimal(leitor.nextLine());

        System.out.print("Para quem foi o pagamento (beneficiário)? ");
        String beneficiario = leitor.nextLine();

        System.out.println("Qual método de pagamento?");
        System.out.println("  1 - Cartão de Crédito");
        System.out.println("  2 - Pix");
        System.out.println("  3 - Dinheiro");
        int opcaoPagamento = Integer.parseInt(leitor.nextLine());

        PaymentMethod metodoPagamento;
        if (opcaoPagamento == 1) {
            metodoPagamento = PaymentMethod.CREDITO;
        } else if (opcaoPagamento == 2) {
            metodoPagamento = PaymentMethod.PIX;
        } else {
            metodoPagamento = PaymentMethod.DINHEIRO;
        }

        Expense despesaDoUsuario = new Expense.ExpenseBuilder()
                .withId(1L)
                .withName(nome)
                .withValue(valor)
                .withBeneficiary(beneficiario)
                .withPaymentMethod(metodoPagamento)
                .withDate(LocalDate.now())
                .withStats(ItemStats.EFETIVADO)
                .withCategory(categoriaAlimentacao)
                .withNote("Registro feito via terminal interativo.")
                .build();

        System.out.println("\n✅ Transação registrada com Sucesso! Relatório Final:");
        System.out.println("==================================================");
        System.out.println("  Descrição: " + despesaDoUsuario.getName());
        System.out.println("  Custo: " + despesaDoUsuario.getValue() + " Reais");
        System.out.println("  Beneficiário: " + despesaDoUsuario.getBeneficiary());
        System.out.println("  Método de pagamento: " + despesaDoUsuario.getPaymentMethod().getPaymentMethod());
        System.out.println("  Categoria: " + despesaDoUsuario.getCategory().getName());
        System.out.println("  Data do Registro: " + despesaDoUsuario.getDate());
        System.out.println("==================================================");

        leitor.close();
    }
}