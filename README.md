# mobile-study
mobile-study

#### Spring Mobile的主要功能

1. 自动设备检测:  Spring Mobile在 server端内置了一个设备解析器的抽象层。它会分析所有过来的请求，然后侦测到设备信息，比如，设备的类型，操作系统等等。
2. 网站偏好管理：使用网站偏好管理，Spring Mobile允许用户选择移动/平板电脑/网站的视图。 
    这是比较不赞成的技术，因为通过使用DeviceDelegatingViewresolver，我们可以根据设备类型跳转到对应的视图层，而不需要来自用户端的任何输入。
3. 站点切换器：站点切换器能够根据用户的设备类型（比如：手机，平板，浏览器等等）将用户自动切换到最合适的视图。
4. 设备感知视图管理器：通常，根据设备类型，我们将用户请求转发到特定站点，以处理特定设备。 
    Spring Mobile的View Manager使开发人员能够灵活地将所有视图以预定义的格式显示出来，Spring Mobile将根据设备类型自动管理不同的视图。



##### tip:
```bash
git init 
git remote add origin https://github.com/helloworldtang/mobile-study.git
git pull origin master --allow-unrelated-histories
```

参考：
> http://mp.weixin.qq.com/s/hIDa628uQKrlAtlh9g72hg