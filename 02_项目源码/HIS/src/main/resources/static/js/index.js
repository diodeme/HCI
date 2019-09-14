// **********************************************//
// index 客户端脚本
//
// @author huayu
// @date 2019-07-22
// **********************************************//

var vm = new Vue({
    el : '#app',
    mixins: [atyTplMixin],
    data: function() {
        return {
        }
    },
    methods : {
        xtglopen : function () {
            Artery.open({
                targetType: '_blank',
                url: '/xtgl/xtgl'
            })
        },
        cwglopen:function () {
            Artery.open({
                targetType: '_blank',
                url: '/cwgl/cwglAll'
            })
        },
        mzopen:function () {
            Artery.open({
                targetType: '_blank',
                url: '/mzysgzz/mzys'
            })
        },
        yjopen:function () {
            Artery.open({
                targetType: '_blank',
                url: '/yjys/yjysAll'
            })
        }
    }
})