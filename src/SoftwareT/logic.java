package SoftwareT;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serve.socketclient;


/**
 * Servlet implementation class logic
 */
@WebServlet("/logic")
public class logic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int begin;
	private int end;
	private int type;
	private int type2;
	private double money;
	private String info="";
	private int number=1;
	private List<luggage> Messege = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public logic() {
		super();
		 
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public double cal() {
		double result = 0.0;
		if (money <= 0) {
			return -3;
		} else {
			result = result + money;
		}
		if (begin == 1 && end == 1) {
			for (int i = 0; i < Messege.size(); i++) {
				luggage fuzhu = Messege.get(i);
				if (fuzhu.getX() > 60 || fuzhu.getY() > 40 || fuzhu.getZ() > 100) {
					return -1;
				}
				if (fuzhu.getW() > 50) {
					return -2;
				}
				double y1 = 40;
				double y2 = 30;
				double y3 = 20;
				double y4 = 10;
				if (type2 == 2) {
					y1 = y1 + 20;
					y2 = y2 + 20;
					y3 = y3 + 20;
					y4 = y4 + 20;
				}
				if (type2 == 3) {
					y1 = y1 + 10;
					y2 = y2 + 10;
					y3 = y3 + 10;
					y4 = y4 + 10;
				}
				if (type == 1) {
					if (i == 0) {
						if (fuzhu.getW() > y1) {
							result = result + money * (fuzhu.getW() - y1) * 0.015;
						}
					} else {
						result = result + money * (fuzhu.getW()) * 0.015;
					}
				}
				if (type == 2) {
					if (i == 0) {
						if (fuzhu.getW() > y2) {
							result = result + money * (fuzhu.getW() - y2) * 0.015;
						}
					} else {
						result = result + money * (fuzhu.getW()) * 0.015;
					}
				}
				if (type == 3) {
					if (i == 0) {
						if (fuzhu.getW() > y3) {
							result = result + money * (fuzhu.getW() - y3) * 0.015;
						}
					} else {
						result = result + money * (fuzhu.getW()) * 0.015;
					}
				}
				if (type == 4) {
					if (i == 0) {
						if (fuzhu.getW() > y4) {
							result = result + money * (fuzhu.getW() - y4) * 0.015;
						}
					} else {
						result = result + money * (fuzhu.getW()) * 0.015;
					}
				}
				if (type == 5) {
					return -4;
				}
			}
		} else {
			for (int i = 0; i < Messege.size(); i++) {
				luggage fuzhu = Messege.get(i);
				if (fuzhu.getall() > 300) {
					return -1;
				}
				if (fuzhu.getW() > 45) {
					return -2;
				}
			}
			if ((begin == 1 && end == 2) || (begin == 2 && end == 1) || (begin == 5 && end == 1)) {
				for (int i = 0; i < Messege.size(); i++) {
					luggage fuzhu = Messege.get(i);
					if (fuzhu.getall() > 158) {
						result = result + 1000;
					}
					double y1 = 32;
					double y2 = 32;
					double y3 = 23;
					double y4 = 10;
					int n1 = 3;
					int n2 = 2;
					int n3 = 2;
					int n4 = 1;
					if (type2 == 2) {
						y1 = y1 + 20;
						y2 = y2 + 20;
						y3 = y3 + 20;
						y4 = y4 + 20;
					}
					if (type2 == 3) {
						y1 = y1 + 10;
						y2 = y2 + 10;
						y3 = y3 + 10;
						y4 = y4 + 10;
					}
					if (type2 == 4) {
						n1 = n1 + 1;
						n2 = n2 + 1;
						n3 = n3 + 1;
						n4 = n4 + 1;
					}
					if (type == 1) {
						if (i < n1) {
							if (fuzhu.getW() > y1) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n1) {
								result = result + 1000;
							} else {
								result = result + 2000;
							}
						}
					}
					if (type == 2) {
						if (i < n2) {
							if (fuzhu.getW() > y2) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n2) {
								result = result + 1000;
							} else {
								result = result + 2000;
							}
						}
					}
					if (type == 3 || type == 5) {
						if (i < n3) {
							if (fuzhu.getW() > y3) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n3) {
								result = result + 1000;
							} else {
								result = result + 2000;
							}
						}
					}
					if (type == 4) {
						if (i < n4) {
							if (fuzhu.getW() > y4) {
								return -4;
							}
						} else {
							return -4;
						}
					}
				}
			} else if ((begin == 1 && end == 3) || (begin == 3 && end == 1)) {
				for (int i = 0; i < Messege.size(); i++) {
					luggage fuzhu = Messege.get(i);
					if (fuzhu.getall() > 158) {
						result = result + 1000;
					}
					double y1 = 32;
					double y2 = 32;
					double y3 = 32;
					double y4 = 10;
					int n1 = 3;
					int n2 = 2;
					int n3 = 1;
					int n4 = 1;
					if (type2 == 2) {
						y1 = y1 + 20;
						y2 = y2 + 20;
						y3 = y3 + 20;
						y4 = y4 + 20;
					}
					if (type2 == 3) {
						y1 = y1 + 10;
						y2 = y2 + 10;
						y3 = y3 + 10;
						y4 = y4 + 10;
					}
					if (type2 == 4) {
						n1 = n1 + 1;
						n2 = n2 + 1;
						n3 = n3 + 1;
						n4 = n4 + 1;
					}
					if (type == 1) {
						if (i < n1) {
							if (fuzhu.getW() > y1) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n1) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 2) {
						if (i < n2) {
							if (fuzhu.getW() > y2) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n2) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 3 || type == 5) {
						if (i < n3) {
							if (fuzhu.getW() > y3) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n3) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 4) {
						if (i < n4) {
							if (fuzhu.getW() > y4) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n4) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
				}
			} else if ((begin == 1 && end == 4) || (begin == 3 && end == 4)) {
				for (int i = 0; i < Messege.size(); i++) {
					luggage fuzhu = Messege.get(i);
					if (fuzhu.getall() > 158) {
						result = result + 1000;
					}
					double y1 = 32;
					double y2 = 32;
					double y3 = 23;
					double y4 = 10;
					int n1 = 3;
					int n2 = 2;
					int n3 = 2;
					int n4 = 1;
					if (type2 == 2) {
						y1 = y1 + 20;
						y2 = y2 + 20;
						y3 = y3 + 20;
						y4 = y4 + 20;
					}
					if (type2 == 3) {
						y1 = y1 + 10;
						y2 = y2 + 10;
						y3 = y3 + 10;
						y4 = y4 + 10;
					}
					if (type2 == 4) {
						n1 = n1 + 1;
						n2 = n2 + 1;
						n3 = n3 + 1;
						n4 = n4 + 1;
					}
					if (type == 1) {
						if (i < n1) {
							if (fuzhu.getW() > y1) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n1) {
								result = result + 1000;
							} else {
								result = result + 2000;
							}
						}
					}
					if (type == 2) {
						if (i < n2) {
							if (fuzhu.getW() > y2) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n2) {
								result = result + 1000;
							} else {
								result = result + 2000;
							}
						}
					}
					if (type == 3 || type == 5) {
						if (i < n3) {
							if (fuzhu.getW() > y3) {
								if (fuzhu.getW() <= 32) {
									result = result + 2000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n3) {
								result = result + 1000;
							} else {
								result = result + 2000;
							}
						}
					}
					if (type == 4) {
						if (i < n4) {
							if (fuzhu.getW() > y4) {
								return -4;
							}
						} else {
							return -4;
						}
					}
				}
			} else if (begin == 6 && end == 1) {
				for (int i = 0; i < Messege.size(); i++) {
					luggage fuzhu = Messege.get(i);
					if (fuzhu.getall() > 158) {
						result = result + 1000;
					}
					double y1 = 32;
					double y2 = 32;
					double y3 = 23;
					double y4 = 10;
					double y5 = 23;
					int n1 = 3;
					int n2 = 3;
					int n3 = 1;
					int n4 = 1;
					int n5 = 1;
					if (type2 == 2) {
						y1 = y1 + 20;
						y2 = y2 + 20;
						y3 = y3 + 20;
						y4 = y4 + 20;
					}
					if (type2 == 3) {
						y1 = y1 + 10;
						y2 = y2 + 10;
						y3 = y3 + 10;
						y4 = y4 + 10;
					}
					if (type2 == 4) {
						n1 = n1 + 1;
						n2 = n2 + 1;
						n3 = n3 + 1;
						n4 = n4 + 1;
					}
					if (type == 1) {
						if (i < n1) {
							if (fuzhu.getW() > y1) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n1) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 2) {
						if (i < n2) {
							if (fuzhu.getW() > y2) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n2) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 3) {
						if (i < n3) {
							if (fuzhu.getW() > y3) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n3) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 4) {
						if (i < n4) {
							if (fuzhu.getW() > y4) {
								return -4;
							}
						} else {
							return -4;
						}
					}
					if (type == 5) {
						if (i < n5) {
							if (fuzhu.getW() > y5) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n5) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
				}
			} else if((begin==7&&end==1)||(begin==1&&end==7)){
				for (int i = 0; i < Messege.size(); i++) {
					luggage fuzhu = Messege.get(i);
					if (fuzhu.getall() > 158) {
						result = result + 1000;
					}
					double y1 = 32;
					double y2 = 23;
					double y3 = 23;
					double y4 = 10;
					double y5 = 23;
					int n1 = 3;
					int n2 = 3;
					int n3 = 1;
					int n4 = 1;
					int n5 = 2;
					if (type2 == 2) {
						y1 = y1 + 20;
						y2 = y2 + 20;
						y3 = y3 + 20;
						y4 = y4 + 20;
					}
					if (type2 == 3) {
						y1 = y1 + 10;
						y2 = y2 + 10;
						y3 = y3 + 10;
						y4 = y4 + 10;
					}
					if (type2 == 4) {
						n1 = n1 + 1;
						n2 = n2 + 1;
						n3 = n3 + 1;
						n4 = n4 + 1;
					}
					if (type == 1) {
						if (i < n1) {
							if (fuzhu.getW() > y1) {
								result = result + 3000;
							}
						} else {
							if (fuzhu.getW() > 32) {
								return -4;
							}
							if (i == n1) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 2) {
						if (i < n2) {
							if (fuzhu.getW() > y2) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n2) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 3) {
						if (i < n3) {
							if (fuzhu.getW() > y3) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n3) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
					if (type == 4) {
						if (i < n4) {
							if (fuzhu.getW() > y4) {
								return -4;
							}
						} else {
							return -4;
						}
					}
					if (type == 5) {
						if (i < n5) {
							if (fuzhu.getW() > y5) {
								if (fuzhu.getW() <= 32) {
									result = result + 1000;
								} else {
									result = result + 3000;
								}
							}
						} else {
							if (fuzhu.getW() > 23) {
								return -4;
							}
							if (i == n5) {
								result = result + 450;
							} else {
								result = result + 1300;
							}
						}
					}
				}
			}
			else {return -4;}
		}

		return result;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		int method = Integer.parseInt(request.getParameter("method"));
		if (method == 1) {
			String Begin = request.getParameter("selectBegin");
			String End = request.getParameter("selectEnd");
			String Type = request.getParameter("selectType");
			String Type2 = request.getParameter("selectType2");
			String Money = request.getParameter("inputmoney");
			begin = Integer.parseInt(Begin);
			end = Integer.parseInt(End);
			type = Integer.parseInt(Type);
			type2 = Integer.parseInt(Type2);
			try {
			money = Double.parseDouble(Money);
			}
			catch(Exception e)
			{
				response.getWriter().print("<script language='javascript'>alert('请输入正确的票价')</script>");
				response.setHeader("refresh", "1;URL=./mainpage.jsp");
				return ;
			}
			double result = cal();
			Messege.clear();
			info="";
			number=1;
			if (result == -1) {
				response.getWriter().print("<script language='javascript'>alert('行李超出尺寸')</script>");
			}
			if (result == -2) {
				response.getWriter().print("<script language='javascript'>alert('行李超重')</script>");
			}
			if (result == -3) {
				response.getWriter().print("<script language='javascript'>alert('票价错误')</script>");
			}
			if (result == -4) {
				response.getWriter().print("<script language='javascript'>alert('此票不满足条件')</script>");
			}
			if (result > 0) {
				response.getWriter().print("<script language='javascript'>alert('价格为" + result + "')</script>");
			}
			response.setHeader("refresh", "1;URL=./mainpage.jsp");
		} else {
			String Length = request.getParameter("Length");
			String Width = request.getParameter("Width");
			String Height = request.getParameter("Height");
			String Weight = request.getParameter("Weight");
			try {
			double x = Double.parseDouble(Length);
			double y = Double.parseDouble(Width);
			double z = Double.parseDouble(Height);
			double w = Double.parseDouble(Weight);
			if (x <= 0 || y <= 0 || z <= 0 || w <= 0) {
				response.getWriter().print("<script language='javascript'>alert('您输入的信息有误')</script>");
				response.setHeader("refresh", "1;URL=./mainpage.jsp");
			} else {
				luggage one = new luggage(x, y, z, w);
				Messege.add(one);
				info=info+"行李"+number+"  长度："+x+"  宽度："+y+"  高度："+z+"  重量："+w+"&#10;";
				number=number+1;
				request.setAttribute("info", info);
				request.getRequestDispatcher("./mainpage.jsp").forward(request, response);
				response.getWriter().print("<script language='javascript'>alert('添加成功')</script>");
				response.setHeader("refresh", "1;URL=./mainpage.jsp");
			}
			}
			catch(Exception e)
			{
				response.getWriter().print("<script language='javascript'>alert('请正确输入')</script>");
				response.setHeader("refresh", "1;URL=./Add.jsp");
			}
		}
	}

}
