

x= 2
y=10
--duplique numero
double x= x*2
--promedio numero
promedio y x= (y+x)/2
--si el numero es positivo
positivo x= x>0
-- funcion retorna la suma o producto 
comparar x y= if prod > suma
    then prod
    else suma
  where
    prod = x * y
    suma = x + y

-- variable usados
a=[1..10]
z= -5
s= 1
v= 8

 

main :: IO ()
main = do
     print(10 *2)
     print((4+6)/2)
     print(positivo z)
     print(comparar s v)
     print(take 5 a)
     