import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import cheweileixingList from '../pages/cheweileixing/list'
import cheweileixingDetail from '../pages/cheweileixing/detail'
import cheweileixingAdd from '../pages/cheweileixing/add'
import cheweixinxiList from '../pages/cheweixinxi/list'
import cheweixinxiDetail from '../pages/cheweixinxi/detail'
import cheweixinxiAdd from '../pages/cheweixinxi/add'
import cheweiyuyueList from '../pages/cheweiyuyue/list'
import cheweiyuyueDetail from '../pages/cheweiyuyue/detail'
import cheweiyuyueAdd from '../pages/cheweiyuyue/add'
import cheliangchuchangList from '../pages/cheliangchuchang/list'
import cheliangchuchangDetail from '../pages/cheliangchuchang/detail'
import cheliangchuchangAdd from '../pages/cheliangchuchang/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discusscheweixinxiList from '../pages/discusscheweixinxi/list'
import discusscheweixinxiDetail from '../pages/discusscheweixinxi/detail'
import discusscheweixinxiAdd from '../pages/discusscheweixinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'cheweileixing',
					component: cheweileixingList
				},
				{
					path: 'cheweileixingDetail',
					component: cheweileixingDetail
				},
				{
					path: 'cheweileixingAdd',
					component: cheweileixingAdd
				},
				{
					path: 'cheweixinxi',
					component: cheweixinxiList
				},
				{
					path: 'cheweixinxiDetail',
					component: cheweixinxiDetail
				},
				{
					path: 'cheweixinxiAdd',
					component: cheweixinxiAdd
				},
				{
					path: 'cheweiyuyue',
					component: cheweiyuyueList
				},
				{
					path: 'cheweiyuyueDetail',
					component: cheweiyuyueDetail
				},
				{
					path: 'cheweiyuyueAdd',
					component: cheweiyuyueAdd
				},
				{
					path: 'cheliangchuchang',
					component: cheliangchuchangList
				},
				{
					path: 'cheliangchuchangDetail',
					component: cheliangchuchangDetail
				},
				{
					path: 'cheliangchuchangAdd',
					component: cheliangchuchangAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discusscheweixinxi',
					component: discusscheweixinxiList
				},
				{
					path: 'discusscheweixinxiDetail',
					component: discusscheweixinxiDetail
				},
				{
					path: 'discusscheweixinxiAdd',
					component: discusscheweixinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
