# Input para as variaveis em String
distancia = IO.gets("Digite em KM a distancia percorrida:")
combustivel_gasto = IO.gets("Digite em L quanto de combustivel você gastou:")
# Conversão de String para Float
{distancia, _} = Float.parse(distancia)
{combustivel_gasto, _} = Float.parse(combustivel_gasto)
