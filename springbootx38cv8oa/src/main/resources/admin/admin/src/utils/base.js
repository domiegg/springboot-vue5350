const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootx38cv8oa/",
            name: "springbootx38cv8oa",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootx38cv8oa/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小区车辆管理系统"
        } 
    }
}
export default base
