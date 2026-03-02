

triple :: Num a => a -> a
triple x = x * 3

decrease :: Num a=> a -> a
decrease x = x - 1

absolute :: (Num a, Ord a) => a -> a
absolute x = if x > 0 then x else -x


f = absolute . decrease

g = decrease . absolute

main :: IO ()
main = do
    print(triple 10)
    print(absolute (-5))
    print(f (-5))
    print(g (-5))



--reecritura de triple (decrease 4)
-- 1-> triple (4-1)
-- 2-> 3 * (4-1)
-- 3-> 3 * 3
-- 4-> 9


