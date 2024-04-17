#include <stdio.h>

int main(){
  char nome[20];
  float altura_m, peso_ideal;
  char sexo;
  printf("Digite seu nome, altura em metros, e sexo (f, m)\n");
  scanf("%s %f %c", nome, &altura_m, &sexo);
  if (sexo == 'f') {
    peso_ideal = (62.1 * altura_m) - 44.7;
  }
  else if (sexo == 'm') {
    peso_ideal = (72.7 * altura_m) - 58;
  }
  else {
    printf("digite um sexo valido\n");
    main();
  }
  printf("O seu peso ideal é de aproximadamente %.2fKg \n", peso_ideal);
}
