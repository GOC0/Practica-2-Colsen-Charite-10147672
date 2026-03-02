
data Persona = Persona{
    nombre :: String,
    edad :: Int
}

mayor :: Persona -> Bool
mayor (Persona nombre edad)=  edad >18

data Figura 
    = Rectangulo Float Float
    |Cuadrado Float
    |Triangulo Float Float Float

perimetro :: Figura -> Float
perimetro(Rectangulo a b)= (a+b)*2
perimetro(Cuadrado l)= l*4
perimetro(Triangulo d g h)= d+g+h 


