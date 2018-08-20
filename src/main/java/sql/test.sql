#신상품 3개 조회할 때 활용할 sql
select *
from
(select tb_product.*,
rank() over(order by reg_dtm desc) as myrank
from tb_product) rank_table
where myrank<=3;


#hit상품 3개 조회할 때 활용할 sql
select p.*, sort_table.sumqty
from
tb_product p, 
(select prd_no, sum(qty) sumqty
from TB_ORDER_PRODUCT
group by prd_no
order by sumqty desc) sort_table
where p.prd_no = sort_table.prd_no
and rownum<=5
;

