update salary
set sex = case
when sex = 'f' then 'm'
when sex = 'm' then 'f'
end
/*
case...when...else clause is similar to 'if..else if' statement
*/