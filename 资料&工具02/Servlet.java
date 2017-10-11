#---------------------------------------------#
# <aw:description>Template for Servlet</aw:description>
# <aw:version>1.1</aw:version>
# <aw:date>04/05/2003</aw:date>
# <aw:author>Ferret Renaud</aw:author>
#---------------------------------------------#

<aw:import>java.io.IOException</aw:import>
<aw:import>java.io.PrintWriter</aw:import>

<aw:import>javax.servlet.ServletException</aw:import>
<aw:import>javax.servlet.http.HttpServlet</aw:import>
<aw:import>javax.servlet.http.HttpServletRequest</aw:import>
<aw:import>javax.servlet.http.HttpServletResponse</aw:import>

<aw:parentClass>javax.servlet.http.HttpServlet</aw:parentClass>

<aw:constructor name="c1">
	/**
	 * Constructor of the object.
	 */
	public <aw:className/>() {
		super();
	}

</aw:constructor> 
 
<aw:method name="doGet">
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	}

</aw:method>

<aw:method name="doPost">
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		doGet(request,response);

	}

</aw:method>

<aw:method name="doPut">
	/**
	 * The doPut method of the servlet. <br>
	 *
	 * This method is called when a HTTP put request is received.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPut(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		// Put your code here
	}

</aw:method>

<aw:method name="doDelete">
	/**
	 * The doDelete method of the servlet. <br>
	 *
	 * This method is called when a HTTP delete request is received.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		// Put your code here
	}

</aw:method>

<aw:method name="init">
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

</aw:method>

<aw:method name="destroy">
	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

</aw:method>

<aw:method name="getServletInfo">
	/**
	 * Returns information about the servlet, such as 
	 * author, version, and copyright. 
	 *
	 * @return String information about this servlet
	 */
	public String getServletInfo() {
		return "This is my default servlet created by Eclipse";
	}

</aw:method>