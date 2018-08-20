select * from tab

# new 상품 3개 조회할 때 활용할 sql
select * from (
select TB_PRODUCT.*, rank() over(order by REG_DTM desc) as myrank from TB_PRODUCT) rank_table 
where rownum <= 3

# hit 상품 조회할 때 활용할 sql
select p.*, sort_table.sumqt from TB_PRODUCT p, (
select prd_no, sum(qty) sumqt from TB_ORDER_PRODUCT group by prd_no order by sumqt desc) sort_table
where p.prd_no = sort_table.prd_no and rownum<=5
	
select * from tb_product	
select * from tb_order_product