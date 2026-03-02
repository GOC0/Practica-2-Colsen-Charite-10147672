


-- a) λx. (λy. x y)
-- Variables ligadas:  x y
-- variable libre: ninguno

-- b) (λx. λy. x) y
-- Variables ligadas: x y y dentro de la función λx. λy. x.
-- Variables libres: la y fuera de la función

-- c)λx. (λx. x z)
-- 	Variables ligadas: ambas x están ligadas, pero en distintos ámbitos
--	Variables libres: z

-- usar mismo nombre de variable en un mismo ambito puede causar confusion pero si se usa en diferente
-- ambito no causara problemas


--(λx. x+1) 4
-- B: (λx. 4+1)
-- B: 5

--(λx.λy. x+ y) y 5
--



--λx (fx)
-- no necesita ser reducido ya esta en forma normal.



--λx.x
-- esta en forma normal
--No hay ninguna aplicación de una lambda a un argumento, por lo tanto no se puede reducir más.

--(λx.x)(λy.y)
--admite reducción, no está en forma normal.


