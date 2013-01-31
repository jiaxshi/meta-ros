DESCRIPTION = "Low-level build system macros and infrastructure for ROS"
SECTION = "devel"
# TODO: License of catkin unmentioned in the repository
LICENSE = "CLOSED"

SRC_URI = "https://github.com/ros/catkin/archive/0.5.58.tar.gz \
  file://catkin-change_default_for_debsetuptools.patch \
  file://catkin-remove_assertion_for_rt_library.patch \
"
SRC_URI[md5sum] = "e4df85e60dc792af9324334547cc76aa"
SRC_URI[sha256sum] = "dd99cc04eeaf16a13185dd0a2f576939fa997dfb16a40ba45068c4d2ebbcb44b"

# DEPENDS = "python-setuptools"
DEPENDS = "python-empy-native python-catkin-pkg-native python"

EXTRA_OECMAKE = "-DSETUPTOOLS_DEB_LAYOUT=OFF"

BBCLASSEXTEND += "native"
inherit cmake pythonnative python-dir

FILES_${PN} += "${libdir}/${PYTHON_DIR}/* ${PYTHON_SITEPACKAGES_DIR}/*"
# FILES_${PN}-dev += "${libdir}/${PYTHON_DIR}/* ${PYTHON_SITEPACKAGES_DIR}/*"

export BUILD_SYS
export HOST_SYS
export STAGING_LIBDIR
export STAGING_INCDIR

# catkin-native: Fails in assert.cmake/rt.cmake;
# after removing check in rt.cmake it works
# but does this resolve the issue?

# Installation of catkin must install catkinConfig.cmake so that
# catkin_EXTRAS_DIR in catkinConfig.cmake points to the right path.
# At the moment, installation points wrongly to the root directory set(catkin_EXTRAS_DIR "/usr/share/catkin/cmake")
# instead of the sysroots environment, e.g.,
# set(catkin_EXTRAS_DIR "/home/lukas/poky-danny-8.0/build/tmp/sysroots/qemux86/usr/share/catkin/cmake")
# TODO: tweak installation to point to the correct path!

