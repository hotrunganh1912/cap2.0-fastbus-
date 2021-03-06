<%@page import="model.bean.SeatBooking"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />

<title>Fasbus-Manage</title>

<!-- add thư vien top-->
<%@ include file="common/topAdmin.jsp"%>
<!-- end add thư vien top-->
</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">
		<!-- right Sidebar -->
		<%@ include file="common/rightBarSideBar.jsp"%>
		<!-- End right of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<!-- Topbar -->
				<%@ include file="common/topAdminBarSideBar.jsp"%>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- Page Heading -->
							<div
								class="d-sm-flex align-items-center justify-content-between mb-4">
								<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
							</div>

							<!-- Content Row -->
							<div class="row">

								<!-- Earnings (Monthly) Card Example -->
								<div class="col-xl-3 col-md-6 mb-4">
									<div class="card border-left-primary shadow h-100 py-2">
										<div class="card-body">
											<div class="row no-gutters align-items-center">
												<div class="col mr-2">
													<div
														class="text-xs font-weight-bold text-primary text-uppercase mb-1">Tổng
														Danh Thu</div>
													<div class="h5 mb-0 font-weight-bold text-gray-800 price"><%=request.getAttribute("totalPrice").toString() %></div>
												</div>
												<div class="col-auto">
													<i class="fas fa-calendar fa-2x text-gray-300"></i>
												</div>
											</div>
										</div>
									</div>
								</div>

								<!-- Earnings (Monthly) Card Example -->
								<div class="col-xl-3 col-md-6 mb-4">
									<div class="card border-left-success shadow h-100 py-2">
										<div class="card-body">
											<div class="row no-gutters align-items-center">
												<div class="col mr-2">
													<div
														class="text-xs font-weight-bold text-success text-uppercase mb-1">Vé Đã Đặt Theo Ngày</div>
													<div class="h5 mb-0 font-weight-bold text-gray-800"><%=request.getAttribute("totalSeat").toString() %>
														Vé</div>
												</div>
												<div class="col-auto">
													<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
												</div>
											</div>
										</div>
									</div>
								</div>

								<!-- Earnings (Monthly) Card Example -->
								<div class="col-xl-3 col-md-6 mb-4">
									<div class="card border-left-info shadow h-100 py-2">
										<div class="card-body">
											<div class="row no-gutters align-items-center">
												<div class="col mr-2">
													<div
														class="text-xs font-weight-bold text-success text-uppercase mb-1">Số
														Số Lượng Xe Bus</div>
													<div class="h5 mb-0 font-weight-bold text-gray-800"><%=request.getAttribute("totalBus").toString() %> Xe</div>
												</div>
												<div class="col-auto">
													<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
												</div>
											</div>
										</div>
									</div>
								</div>

								<!-- Pending Requests Card Example -->
								<div class="col-xl-3 col-md-6 mb-4">
									<div class="card border-left-warning shadow h-100 py-2">
										<div class="card-body">
											<div class="row no-gutters align-items-center">
												<div class="col mr-2">
													<div
														class="text-xs font-weight-bold text-warning text-uppercase mb-1">	Vé Cần Xác Nhận</div>
													<div class="h5 mb-0 font-weight-bold text-gray-800">
														<a href="LoadListConfirmTicketBusinessServlet"><%=request.getAttribute("totalSeatIsApproving").toString() %> Vé</a>
													</div>
												</div>
												<div class="col-auto">
													<i class="fas fa-comments fa-2x text-gray-300"></i>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="card shadow mb-4">
								<!-- Card Header - Dropdown -->
								<!-- Load List doanh thu  -->
								<div
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<h6 class="m-0 font-weight-bold text-primary">Danh Thu
										Theo Tháng</h6>
									<div class="dropdown no-arrow">
										<a class="dropdown-toggle" href="#" role="button"
											id="dropdownMenuLink" data-toggle="dropdown"
											aria-haspopup="true" aria-expanded="false"> <i
											class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
										</a>
										<div
											class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
											aria-labelledby="dropdownMenuLink">
											<div class="dropdown-header">Dropdown Header:</div>
											<a class="dropdown-item" href="#">Action</a> <a
												class="dropdown-item" href="#">Another action</a>
											<div class="dropdown-divider"></div>
											<a class="dropdown-item" href="#">Something else here</a>
										</div>
									</div>
								</div>
								<!-- Card Body -->
								<div class="card-body">
									<div class="chart-area">
										<canvas id="myAreaChart"></canvas>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<%@ include file="common/footerAdminPage.jsp"%>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->
	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->

	<!-- End Scroll to Top Button-->

	<!-- Logout Modal-->
	<%@ include file="common/logoutModal.jsp"%>
	<!-- end Logout Modal-->

	<!-- add file jquery -->
	<%@ include file="common/botAdmin.jsp"%>
</body>
<script type="text/javascript">
	class SumPriceEachMonth{
		constructor(month,price){
			this.month=month;
			this.price=price;
		}
	}
	arraySumPriceEachMonth=[];
	
	function checkMonth(month){
		let sumPrice =0;
		for(const element of arraySumPriceEachMonth){
			if(element.month == month)
				sumPrice=element.price;
			}
		return sumPrice;
	}
	
	$(document).ready(function() {
		
		$(".price").each(function() {
			$(this).html(Number($(this).html()).toLocaleString('it-IT', {
				style : 'currency',
				currency : 'VND'
			})).toString;
		});
		<%
			for( SeatBooking listPrice : (List<SeatBooking>)request.getAttribute("listPrice")){
		%>
		arraySumPriceEachMonth.push(new SumPriceEachMonth(<%= listPrice.getMonth()%>,<%= listPrice.getPrice()%>));
		 <%}
		 %>
	});
			//Set new default font family and font color to mimic Bootstrap's default styling
			Chart.defaults.global.defaultFontFamily = 'Nunito',
			'-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
	Chart.defaults.global.defaultFontColor = '#858796';

	// Area Chart Example
	var ctx = document.getElementById("myAreaChart");
	setTimeout(function(){
		var myLineChart = new Chart(
				ctx,
				{
					type : 'line',
					data : {
						labels : [ "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4",
								"Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8",
								"Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" ],
						datasets : [ {
							label : "Danh Thu",
							lineTension : 0.3,
							backgroundColor : "rgba(78, 115, 223, 0.05)",
							borderColor : "rgba(78, 115, 223, 1)",
							pointRadius : 3,
							pointBackgroundColor : "rgba(78, 115, 223, 1)",
							pointBorderColor : "rgba(78, 115, 223, 1)",
							pointHoverRadius : 3,
							pointHoverBackgroundColor : "rgba(78, 115, 223, 1)",
							pointHoverBorderColor : "rgba(78, 115, 223, 1)",
							pointHitRadius : 10,
							pointBorderWidth : 2,
							data : [ checkMonth(1), checkMonth(2), checkMonth(3), checkMonth(4), checkMonth(5), checkMonth(6), checkMonth(7),
								checkMonth(8), checkMonth(9), checkMonth(10), checkMonth(11), checkMonth(12) ],
						} ],
					},
					options : {
						maintainAspectRatio : false,
						layout : {
							padding : {
								left : 10,
								right : 25,
								top : 25,
								bottom : 0
							}
						},
						scales : {
							xAxes : [ {
								time : {
									unit : 'date'
								},
								gridLines : {
									display : false,
									drawBorder : false
								},
								ticks : {
									maxTicksLimit : 7
								}
							} ],
							yAxes : [ {
								ticks : {
									maxTicksLimit : 5,
									padding : 10,
									// Include a dollar sign in the ticks
									callback : function(value, index, values) {
										return value.toLocaleString('it-IT', {
											style : 'currency',
											currency : 'VND'
										});
									}
								},
								gridLines : {
									color : "rgb(234, 236, 244)",
									zeroLineColor : "rgb(234, 236, 244)",
									drawBorder : false,
									borderDash : [ 2 ],
									zeroLineBorderDash : [ 2 ]
								}
							} ],
						},
						legend : {
							display : false
						},
						tooltips : {
							backgroundColor : "rgb(255,255,255)",
							bodyFontColor : "#858796",
							titleMarginBottom : 10,
							titleFontColor : '#6e707e',
							titleFontSize : 14,
							borderColor : '#dddfeb',
							borderWidth : 1,
							xPadding : 15,
							yPadding : 15,
							displayColors : false,
							intersect : false,
							mode : 'index',
							caretPadding : 10,
							callbacks : {
								label : function(tooltipItem, chart) {
									var datasetLabel = chart.datasets[tooltipItem.datasetIndex].label
											|| '';
									return datasetLabel
											+ " "
											+ tooltipItem.yLabel.toLocaleString(
													'it-IT', {
														style : 'currency',
														currency : 'VND'
													});
								}
							}
						}
					}
				});
		
	}, 1000);
</script>
</html>
