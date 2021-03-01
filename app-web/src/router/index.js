import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

//前台
import Index from '../views/front/Index'

//管理员
import AdminIndex from '../views/admin/Index'

Vue.use(Router)

export default new Router({
  routes: [
    //Front
    {
      path: '/',
      name: 'Index',
      component: Index,
      meta: {
        requireLogin: false
      }
    },

    //Admin
    {
      path: '/admin',
      name: 'AdminIndex',
      component: AdminIndex,
      meta: {
        requireLogin: true
      }
    },

    //test
    {
      path: '/hw',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
