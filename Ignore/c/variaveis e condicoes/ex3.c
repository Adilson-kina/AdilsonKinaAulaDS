#include <stdio.h>

int main(){
  char nome[20];
  float salario, vendas_reais, comissao_porcentagem, comissao, salario_final;
  comissao_porcentagem = 0.15;
  printf("Digite seu nome:");
  scanf("%s", nome);
  printf("Digite seu salario, e quanto voce fez em vendas em Reais:");
  scanf("%f %f", &salario, &vendas_reais);
  comissao = vendas_reais * comissao_porcentagem;
  salario_final = salario + comissao;
  printf("Olá %s, com seu salario fixo de R$%.2f e com base em quanto voce vendeu seu salario final será de R$%.2f", nome, salario, salario_final);
}
