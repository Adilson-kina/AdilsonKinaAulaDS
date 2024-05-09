num1 = IO.gets("Digite o primeiro número:")
{num1, _} = Float.parse(num1)
num2 = IO.gets("Digite o segundo número:")
{num2, _} = Float.parse(num2)
soma = num1 + num2
sub = num1 - num2
div = num1 / num2
mult = num1 * num2
IO.puts("A soma entre #{num1} e #{num2} é de #{soma}, ja a subtração é de #{sub}")
IO.puts("A multiplicação entre #{num1} e #{num2} é de #{mult}, ja a divisão é de #{div}")
