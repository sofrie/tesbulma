import lazyLoading from './lazyLoading'

export default {
  name: 'Logistic',
  path: '/logistic',
  meta: {
    icon: 'fa-truck',
    expanded: false,
    link: 'logistic/index.vue'
  },
  component: lazyLoading('logistic', true)
}
