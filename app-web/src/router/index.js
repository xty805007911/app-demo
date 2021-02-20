import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

//前台
import Index from  '../views/front/Index'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index,
      meta: {
        requireLogin: false
      }
    },
    {
      path: '/hw',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
