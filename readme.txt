sanlly-eureka 注册中心 8761
sanlly-zuul 网关 9030
sanlly-auth 权限模块 9031
sanlly-production 生产模块 9032
sanlly-purchase 采购模块 9033
sanlly-warehouse 仓储模块 9034
sanlly-monitor 监控模块 9099
sanlly-common 通用模块（依赖项）
sanlly-workflow 流程模块 9040
sanlly-finance 财务模块 9050

打包命令：
mvn clean package -Pprod -Dmaven.test.skip=true

安装字体
fc-list :lang=zh
yum -y install mkfontscale
yum -y install fontconfig
mkdir -p /usr/share/fonts/win
cd /usr/share/fonts/win
###上传字体
chmod  -Rf 755 *
mkfontscale
mkfontdir
fc-cache –fv
fc-list :lang=zh