
-- cuandrado de un numero
double :: Num a => a-> a
double x = x^2
--incrementa
incre :: Num a=> a -> a
incre x = x + 1

-- incrementa depues double
incrementthendouble :: Num a => a -> a
incrementthendouble = double . incre

-- double than increment
doublethenincrement :: Num a => a -> a
doublethenincrement = incre . double